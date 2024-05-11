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


import com.dao.ShijuanpiyueDao;
import com.entity.ShijuanpiyueEntity;
import com.service.ShijuanpiyueService;
import com.entity.vo.ShijuanpiyueVO;
import com.entity.view.ShijuanpiyueView;

@Service("shijuanpiyueService")
public class ShijuanpiyueServiceImpl extends ServiceImpl<ShijuanpiyueDao, ShijuanpiyueEntity> implements ShijuanpiyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijuanpiyueEntity> page = this.selectPage(
                new Query<ShijuanpiyueEntity>(params).getPage(),
                new EntityWrapper<ShijuanpiyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijuanpiyueEntity> wrapper) {
		  Page<ShijuanpiyueView> page =new Query<ShijuanpiyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijuanpiyueVO> selectListVO(Wrapper<ShijuanpiyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijuanpiyueVO selectVO(Wrapper<ShijuanpiyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijuanpiyueView> selectListView(Wrapper<ShijuanpiyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijuanpiyueView selectView(Wrapper<ShijuanpiyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
