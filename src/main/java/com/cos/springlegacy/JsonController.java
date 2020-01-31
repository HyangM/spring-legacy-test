package com.cos.springlegacy;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

@Controller
public class JsonController {

	// 스프링은 form의 name값과 혹은 쿼리스트링만 오브젝트로 자동 변환!!
	@RequestMapping(value="/jsonTest", method= RequestMethod.POST)
	public @ResponseBody RequestJsonDto jsonTest(@RequestBody RequestJsonDto requestJsonDto) { // {제이슨}
//		public String jsonHome(@RequestBody Map<String, Object> requestJsonDto) { // {제이슨}
		
//			System.out.println(requestJsonDto.get("id"));
		System.out.println(requestJsonDto.getId());
		
		return requestJsonDto;
	}
	
	// http://localhost:8080/springlegacy/jsonHome/안녕 
	// {num} 위치는 변수. 아무거나 다 가능함
	@RequestMapping(value="/jsonHome/{num}", method= RequestMethod.GET)
	public String jsonHome(@PathVariable int num) {
		
		System.out.println("num : "+num);
		
		return "jsonHome";
	}
}
