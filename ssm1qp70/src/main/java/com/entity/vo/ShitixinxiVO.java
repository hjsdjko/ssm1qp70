package com.entity.vo;

import com.entity.ShitixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 试题信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public class ShitixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 测试名称
	 */
	
	private String ceshimingcheng;
		
	/**
	 * 标签类型
	 */
	
	private String biaoqianleixing;
		
	/**
	 * 难度等级
	 */
	
	private String nandudengji;
		
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
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：测试名称
	 */
	 
	public void setCeshimingcheng(String ceshimingcheng) {
		this.ceshimingcheng = ceshimingcheng;
	}
	
	/**
	 * 获取：测试名称
	 */
	public String getCeshimingcheng() {
		return ceshimingcheng;
	}
				
	
	/**
	 * 设置：标签类型
	 */
	 
	public void setBiaoqianleixing(String biaoqianleixing) {
		this.biaoqianleixing = biaoqianleixing;
	}
	
	/**
	 * 获取：标签类型
	 */
	public String getBiaoqianleixing() {
		return biaoqianleixing;
	}
				
	
	/**
	 * 设置：难度等级
	 */
	 
	public void setNandudengji(String nandudengji) {
		this.nandudengji = nandudengji;
	}
	
	/**
	 * 获取：难度等级
	 */
	public String getNandudengji() {
		return nandudengji;
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
			
}
