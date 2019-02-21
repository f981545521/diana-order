package cn.acyou.diana.order.edtity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author youfang
 * @date 2018-04-15 下午 07:36
 **/
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 5350645545628778721L;

    private Integer id;

    private String name;

    private Integer age;

    private Date birth;

}
