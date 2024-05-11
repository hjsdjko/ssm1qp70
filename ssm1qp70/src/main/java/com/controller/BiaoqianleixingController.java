package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BiaoqianleixingEntity;
import com.entity.view.BiaoqianleixingView;

import com.service.BiaoqianleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 标签类型
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-08 20:28:00
 */
@RestController
@RequestMapping("/biaoqianleixing")
public class BiaoqianleixingController {
    @Autowired
    private BiaoqianleixingService biaoqianleixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BiaoqianleixingEntity biaoqianleixing, 
		HttpServletRequest request){

        EntityWrapper<BiaoqianleixingEntity> ew = new EntityWrapper<BiaoqianleixingEntity>();
		PageUtils page = biaoqianleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biaoqianleixing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BiaoqianleixingEntity biaoqianleixing, HttpServletRequest request){
        EntityWrapper<BiaoqianleixingEntity> ew = new EntityWrapper<BiaoqianleixingEntity>();
		PageUtils page = biaoqianleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biaoqianleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BiaoqianleixingEntity biaoqianleixing){
       	EntityWrapper<BiaoqianleixingEntity> ew = new EntityWrapper<BiaoqianleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( biaoqianleixing, "biaoqianleixing")); 
        return R.ok().put("data", biaoqianleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BiaoqianleixingEntity biaoqianleixing){
        EntityWrapper< BiaoqianleixingEntity> ew = new EntityWrapper< BiaoqianleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( biaoqianleixing, "biaoqianleixing")); 
		BiaoqianleixingView biaoqianleixingView =  biaoqianleixingService.selectView(ew);
		return R.ok("查询标签类型成功").put("data", biaoqianleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BiaoqianleixingEntity biaoqianleixing = biaoqianleixingService.selectById(id);
        return R.ok().put("data", biaoqianleixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BiaoqianleixingEntity biaoqianleixing = biaoqianleixingService.selectById(id);
        return R.ok().put("data", biaoqianleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BiaoqianleixingEntity biaoqianleixing, HttpServletRequest request){
    	biaoqianleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(biaoqianleixing);

        biaoqianleixingService.insert(biaoqianleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BiaoqianleixingEntity biaoqianleixing, HttpServletRequest request){
    	biaoqianleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(biaoqianleixing);

        biaoqianleixingService.insert(biaoqianleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BiaoqianleixingEntity biaoqianleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(biaoqianleixing);
        biaoqianleixingService.updateById(biaoqianleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        biaoqianleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BiaoqianleixingEntity> wrapper = new EntityWrapper<BiaoqianleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = biaoqianleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
