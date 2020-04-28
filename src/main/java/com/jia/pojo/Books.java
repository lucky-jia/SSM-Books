package com.jia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ： jiachuixun
 * @date ： 2020-04-24 15:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books implements Serializable {
    private Integer bookId;
    private String bookName;
    private Integer bookCounts;
    private String detail;
}
