/*
 * chandler-es
 * 2019-10-13 14:12
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.instance.client.example.document;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2019-10-13 14:12
 * @since 1.8
 */
@Document(indexName = "store", type = "_doc")
@Data
public class StoreDocument {
}
