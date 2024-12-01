package com.jenil.LibraryManagement.service;

import com.jenil.LibraryManagement.dto.PublisherDTO;
import com.jenil.LibraryManagement.dto.PublisherSaveDTO;
import com.jenil.LibraryManagement.dto.PublisherUpdateDTO;

import java.util.List;

public interface PublisherService {
    String addPublisher(PublisherSaveDTO publisherSaveDTO);

    List<PublisherDTO> getAllPublisher();

    String updatePublisher(PublisherUpdateDTO publisherUpdateDTO);

    String deletePublisher(int id);
}
