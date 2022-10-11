package baseline.sysmgmt.controller;


import baseline.sysmgmt.common.ResponseResult;
import baseline.sysmgmt.model.entity.Menu;
import baseline.sysmgmt.service.MenuService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author crelle
 * @since 2022-10-01 12:06:26
 */
@RestController
@RequestMapping("/sysmgmt/menu")
public class MenuController implements BaseController<Menu> {

    @Autowired
    private MenuService menuService;

    @Override
    public ResponseResult<Menu> create(Menu obj) {
        return null;
    }

    @Override
    public ResponseResult<Menu> queryById(Long id) {
        return null;
    }

    @Override
    public ResponseResult<IPage<Menu>> pageByCondition(IPage<Menu> pageBean) {
        return null;
    }

    @Override
    public ResponseResult<List<Menu>> queryAll() {
        return null;
    }

    @Override
    public ResponseResult<String> updateById(Long id, Menu obj) {
        return null;
    }

    @Override
    public ResponseResult<String> deleteById(Long id) {
        return null;
    }
}
