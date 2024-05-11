package com.entity.view;

import com.entity.BiaoqianleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 标签类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
@TableName("biaoqianleixing")
public class BiaoqianleixingView  extends BiaoqianleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiaoqianleixingView(){
	}
 
 	public BiaoqianleixingView(BiaoqianleixingEntity biaoqianleixingEntity){
 	try {
			BeanUtils.copyProperties(this, biaoqianleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
