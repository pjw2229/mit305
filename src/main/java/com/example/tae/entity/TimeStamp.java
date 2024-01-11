package com.example.tae.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
public class TimeStamp {
    @CreatedDate
    @Column(name = "regDate",updatable = false)
    private Date regDate;

    @LastModifiedDate
    @Column(name = "modDate")
    private Date modDate;
}
