package com.entity.vo;

import com.entity.KaoshichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考试成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
public class KaoshichengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 测试名称
	 */
	
	private String ceshimingcheng;
		
	/**
	 * 正确数
	 */
	
	private Integer zhengqueshu;
		
	/**
	 * 考试成绩
	 */
	
	private Integer kaoshichengji;
		
	/**
	 * 排名
	 */
	
	private Integer paiming;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
	 * 设置：正确数
	 */
	 
	public void setZhengqueshu(Integer zhengqueshu) {
		this.zhengqueshu = zhengqueshu;
	}
	
	/**
	 * 获取：正确数
	 */
	public Integer getZhengqueshu() {
		return zhengqueshu;
	}
				
	
	/**
	 * 设置：考试成绩
	 */
	 
	public void setKaoshichengji(Integer kaoshichengji) {
		this.kaoshichengji = kaoshichengji;
	}
	
	/**
	 * 获取：考试成绩
	 */
	public Integer getKaoshichengji() {
		return kaoshichengji;
	}
				
	
	/**
	 * 设置：排名
	 */
	 
	public void setPaiming(Integer paiming) {
		this.paiming = paiming;
	}
	
	/**
	 * 获取：排名
	 */
	public Integer getPaiming() {
		return paiming;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
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
