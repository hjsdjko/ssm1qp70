package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShitixinxiDao;
import com.entity.ShitixinxiEntity;
import com.service.ShitixinxiService;
import com.entity.vo.ShitixinxiVO;
import com.entity.view.ShitixinxiView;

@Service("shitixinxiService")
public class ShitixinxiServiceImpl extends ServiceImpl<ShitixinxiDao, ShitixinxiEntity> implements ShitixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShitixinxiEntity> page = this.selectPage(
                new Query<ShitixinxiEntity>(params).getPage(),
                new EntityWrapper<ShitixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShitixinxiEntity> wrapper) {
		  Page<ShitixinxiView> page =new Query<ShitixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShitixinxiVO> selectListVO(Wrapper<ShitixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShitixinxiVO selectVO(Wrapper<ShitixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShitixinxiView> selectListView(Wrapper<ShitixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShitixinxiView selectView(Wrapper<ShitixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
