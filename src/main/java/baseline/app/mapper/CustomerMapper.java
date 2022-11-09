package baseline.app.mapper;

import baseline.app.model.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crelle
 * @since 2022-11-09 10:06:28
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}
