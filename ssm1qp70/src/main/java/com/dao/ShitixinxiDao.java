package com.dao;

import com.entity.ShitixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShitixinxiVO;
import com.entity.view.ShitixinxiView;


/**
 * 试题信息
 * 
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface ShitixinxiDao extends BaseMapper<ShitixinxiEntity> {
	
	List<ShitixinxiVO> selectListVO(@Param("ew") Wrapper<ShitixinxiEntity> wrapper);
	
	ShitixinxiVO selectVO(@Param("ew") Wrapper<ShitixinxiEntity> wrapper);
	
	List<ShitixinxiView> selectListView(@Param("ew") Wrapper<ShitixinxiEntity> wrapper);

	List<ShitixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShitixinxiEntity> wrapper);
	
	ShitixinxiView selectView(@Param("ew") Wrapper<ShitixinxiEntity> wrapper);
	
}
