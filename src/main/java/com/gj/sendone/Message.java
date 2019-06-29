package com.gj.sendone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gjing
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String userId;

    private String message;
}
