/**
 * (c) Copyright 2018 Satellite GPS Asset and Tracking Mgt., Inc.
 * All rights reserved. All other trademarks and copyrights referred to herein
 * are the property of their respective holders. No part of this code may be
 * reproduced in any form or by any means or used to take any derivative work,
 * without written permission from Satellite GPS Asset and Tracking Mgt., Inc.
 */
package com.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class BaseEntity {

    private String id;
    @CreatedDate
    private long dateCreated;
    @LastModifiedDate
    private long dateModified;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;
}
