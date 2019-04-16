/**
 * (c) Copyright 2018 Satellite GPS Asset and Tracking Mgt., Inc.
 * All rights reserved. All other trademarks and copyrights referred to herein
 * are the property of their respective holders. No part of this code may be
 * reproduced in any form or by any means or used to take any derivative work,
 * without written permission from Satellite GPS Asset and Tracking Mgt., Inc.
 */
package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@EnableMongoAuditing
@Configuration
public class AuditConfig implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context.getAuthentication() == null) {
            return Optional.empty();
        }
        return Optional.of(context.getAuthentication().getName());
    }
}