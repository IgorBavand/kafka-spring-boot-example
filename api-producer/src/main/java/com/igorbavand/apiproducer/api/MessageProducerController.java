package com.igorbavand.apiproducer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igorbavand.apiproducer.service.SendMessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/message")
@RequiredArgsConstructor
public class MessageProducerController {

  private final SendMessageService service;

  @GetMapping
  public String sendMessage() {
    service.sendMessage("teste envio de mensagem");
    return "message sent";
  }

}
