package com.entity.vo;

import com.entity.ShiticeshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 试题测试
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public class ShiticeshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 题目
	 */
	
	private String timu;
		
	/**
	 * 题目类型
	 */
	
	private String timuleixing;
		
	/**
	 * 得分
	 */
	
	private Integer defen;
		
	/**
	 * 选项
	 */
	
	private String xuanxiang;
		
	/**
	 * 答题
	 */
	
	private String dati;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：题目
	 */
	 
	public void setTimu(String timu) {
		this.timu = timu;
	}
	
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
				
	
	/**
	 * 设置：题目类型
	 */
	 
	public void setTimuleixing(String timuleixing) {
		this.timuleixing = timuleixing;
	}
	
	/**
	 * 获取：题目类型
	 */
	public String getTimuleixing() {
		return timuleixing;
	}
				
	
	/**
	 * 设置：得分
	 */
	 
	public void setDefen(Integer defen) {
		this.defen = defen;
	}
	
	/**
	 * 获取：得分
	 */
	public Integer getDefen() {
		return defen;
	}
				
	
	/**
	 * 设置：选项
	 */
	 
	public void setXuanxiang(String xuanxiang) {
		this.xuanxiang = xuanxiang;
	}
	
	/**
	 * 获取：选项
	 */
	public String getXuanxiang() {
		return xuanxiang;
	}
				
	
	/**
	 * 设置：答题
	 */
	 
	public void setDati(String dati) {
		this.dati = dati;
	}
	
	/**
	 * 获取：答题
	 */
	public String getDati() {
		return dati;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
