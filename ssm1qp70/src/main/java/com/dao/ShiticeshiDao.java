package com.dao;

import com.entity.ShiticeshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiticeshiVO;
import com.entity.view.ShiticeshiView;


/**
 * 试题测试
 * 
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface ShiticeshiDao extends BaseMapper<ShiticeshiEntity> {
	
	List<ShiticeshiVO> selectListVO(@Param("ew") Wrapper<ShiticeshiEntity> wrapper);
	
	ShiticeshiVO selectVO(@Param("ew") Wrapper<ShiticeshiEntity> wrapper);
	
	List<ShiticeshiView> selectListView(@Param("ew") Wrapper<ShiticeshiEntity> wrapper);

	List<ShiticeshiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiticeshiEntity> wrapper);
	
	ShiticeshiView selectView(@Param("ew") Wrapper<ShiticeshiEntity> wrapper);
	
}
