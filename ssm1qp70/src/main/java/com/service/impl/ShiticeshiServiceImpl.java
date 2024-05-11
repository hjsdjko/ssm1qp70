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


import com.dao.ShiticeshiDao;
import com.entity.ShiticeshiEntity;
import com.service.ShiticeshiService;
import com.entity.vo.ShiticeshiVO;
import com.entity.view.ShiticeshiView;

@Service("shiticeshiService")
public class ShiticeshiServiceImpl extends ServiceImpl<ShiticeshiDao, ShiticeshiEntity> implements ShiticeshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiticeshiEntity> page = this.selectPage(
                new Query<ShiticeshiEntity>(params).getPage(),
                new EntityWrapper<ShiticeshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiticeshiEntity> wrapper) {
		  Page<ShiticeshiView> page =new Query<ShiticeshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiticeshiVO> selectListVO(Wrapper<ShiticeshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiticeshiVO selectVO(Wrapper<ShiticeshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiticeshiView> selectListView(Wrapper<ShiticeshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiticeshiView selectView(Wrapper<ShiticeshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
