package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoImpl <br/>
 * Description: <br/>
 * date: 2022/2/24 16:46<br/>
 *
 * @author thxx<br />
 * @since JDK 1.8
 */
@Repository
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String select() {
        return "Select";
    }
}
