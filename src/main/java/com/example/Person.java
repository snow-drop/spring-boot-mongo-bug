/**
 * (c) Copyright 2018 Satellite GPS Asset and Tracking Mgt., Inc.
 * All rights reserved. All other trademarks and copyrights referred to herein
 * are the property of their respective holders. No part of this code may be
 * reproduced in any form or by any means or used to take any derivative work,
 * without written permission from Satellite GPS Asset and Tracking Mgt., Inc.
 */
package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private Address address;
}
