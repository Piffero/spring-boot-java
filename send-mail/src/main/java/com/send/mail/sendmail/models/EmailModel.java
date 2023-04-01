package com.send.mail.sendmail.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.send.mail.sendmail.enums.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bg_email")
public class EmailModel implements Serializable{
    private static final long serialVersionUUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    @Column (nullable = false, length = 80)
    private String ownerRef;
    @Column (nullable = false, length = 120)
    private String emailFrom;
    @Column (nullable = false, length = 120)
    private String emailTo;
    @Column (nullable = false, length = 40)
    private String subject;
    @Column (nullable = false, columnDefinition = "TEXT")
    private String body;
    @Column (nullable = false)
    private LocalDateTime sendDateTime;
    @Column (nullable = true)
    private StatusEmail StatusEmail;

}
