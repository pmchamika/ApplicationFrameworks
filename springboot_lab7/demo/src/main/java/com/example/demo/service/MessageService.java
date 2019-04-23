package com.example.demo.service;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Message;
import com.example.demo.repository.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	@RequestMapping(value = "/messages", method = RequestMethod.POST)
	public Message addMessage(@RequestBody Message message) {

		message.setId(UUID.randomUUID().toString());
		message.setDeleted(false);
		message.setCreatedAt(Calendar.getInstance().getTime());
		return messageRepository.save(message);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Message> getMessage(@PathVariable("id") String id) {

		return messageRepository.findById(id);

	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getAllMessage() {

		return null;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Message updateMessage(@PathVariable("id") String id, Message message) {

		if (messageRepository.findById(id) == null) {
			// return Http
		}
		return null;

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Message delMessage(@PathVariable("id") String id) {

		return null;

	}

}
