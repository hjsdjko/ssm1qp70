package com.dao;

import com.entity.BiaoqianleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaoqianleixingVO;
import com.entity.view.BiaoqianleixingView;


/**
 * 标签类型
 * 
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public interface BiaoqianleixingDao extends BaseMapper<BiaoqianleixingEntity> {
	
	List<BiaoqianleixingVO> selectListVO(@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);
	
	BiaoqianleixingVO selectVO(@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);
	
	List<BiaoqianleixingView> selectListView(@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);

	List<BiaoqianleixingView> selectListView(Pagination page,@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);
	
	BiaoqianleixingView selectView(@Param("ew") Wrapper<BiaoqianleixingEntity> wrapper);
	
}
