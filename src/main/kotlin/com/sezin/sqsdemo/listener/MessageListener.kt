package com.sezin.sqsdemo.listener

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.awspring.cloud.sqs.annotation.SqsListener
import org.springframework.messaging.Message
import org.springframework.stereotype.Component

@Component
class MessageListener {

    @SqsListener("my-message-queue-name")
    fun receiveMessage(
        message: Message<CustomMessage>,
    ) {
        println("Message received from SQS listener. msg=${message.payload.msg}, code=${message.payload.msgCode}, headers=${message.headers}")
    }

    data class CustomMessage @JsonCreator constructor(
        @JsonProperty("msg") val msg: String,
        @JsonProperty("msgCode") val msgCode: Int,
    )
}
