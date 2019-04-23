package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;
import com.example.demo.repository.MessageRepository;
import com.example.demo.service.MessageService;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {
	
	
	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/messages", method = RequestMethod.POST)
	public Message addMessage(@RequestBody Message massage) {

		return null;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody HttpEntity<Message> getMessage(@PathVariable("id") String id) {
		Optional<Message> messageOpt = messageService.getMessage(id);
		if (messageOpt.isPresent()) {
			return new ResponseEntity<Message> (messageOpt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getAllMessage() {

		return null;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Message updateMessage(@PathVariable("id") String id, Message message) {

		return null;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Message delMessage(@PathVariable("id") String id) {

		return null;

	}

}
