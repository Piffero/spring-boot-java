package com.send.mail.sendmail.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.send.mail.sendmail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>{
    
}
