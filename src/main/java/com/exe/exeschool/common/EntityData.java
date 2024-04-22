package com.exe.exeschool.common;

import java.time.LocalDateTime;

import com.querydsl.core.BooleanBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.*;

import lombok.Data;

@Data
@MappedSuperclass
public class EntityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "updated_by")
    @LastModifiedBy
    private String updatedBy;

    @Column(name = "status")
    private String status;

    @Column(name = "created_date", updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(name = "updated_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private LocalDateTime updatedDate;

    public BooleanBuilder buildPredicate() {
    QEntityData qRecipient = QEntityData.entityData;
    return buildPredicate(qRecipient, new BooleanBuilder());
    }

    public BooleanBuilder buildPredicate(QEntityData qRecipient, BooleanBuilder
    builder) {
    if (this.id != null) {
    builder.and(qRecipient.id.eq(this.id));
    }
    if (this.createdBy != null) {
    builder.and(qRecipient.createdBy.eq(this.createdBy));
    }
    if (this.updatedBy != null) {
    builder.and(qRecipient.updatedBy.eq(this.updatedBy));
    }
    if (this.status != null) {
    builder.and(qRecipient.status.eq(this.status));
    }
    if (this.createdDate != null) {
    builder.and(qRecipient.createdDate.eq(this.createdDate));
    }
    if (this.updatedDate != null) {
    builder.and(qRecipient.updatedDate.eq(this.updatedDate));
    }

    return builder;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EntityData)) {
            return false;
        }
        EntityData other = (EntityData) obj;
        return this.id != null && this.id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
