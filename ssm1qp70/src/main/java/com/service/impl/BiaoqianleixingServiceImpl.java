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


import com.dao.BiaoqianleixingDao;
import com.entity.BiaoqianleixingEntity;
import com.service.BiaoqianleixingService;
import com.entity.vo.BiaoqianleixingVO;
import com.entity.view.BiaoqianleixingView;

@Service("biaoqianleixingService")
public class BiaoqianleixingServiceImpl extends ServiceImpl<BiaoqianleixingDao, BiaoqianleixingEntity> implements BiaoqianleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaoqianleixingEntity> page = this.selectPage(
                new Query<BiaoqianleixingEntity>(params).getPage(),
                new EntityWrapper<BiaoqianleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaoqianleixingEntity> wrapper) {
		  Page<BiaoqianleixingView> page =new Query<BiaoqianleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaoqianleixingVO> selectListVO(Wrapper<BiaoqianleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaoqianleixingVO selectVO(Wrapper<BiaoqianleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaoqianleixingView> selectListView(Wrapper<BiaoqianleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaoqianleixingView selectView(Wrapper<BiaoqianleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
