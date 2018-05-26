package com.example.demo.control;



//import java.io.File;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;

import com.example.demo.nutity.User;

@Controller

public class UserControl {
//	@RequestMapping(value = "save", method = RequestMethod.GET)
//	public String get(User user) {
//		System.out.println(user);
//		return "success";
//	}
//	@RequestMapping(value="upload")
//	public String upload(@RequestParam(value="file",required=false) MultipartFile file,Model model) {
//		String path ="F:data/";
//		String fileName= file.getOriginalFilename();
//		File targetfile =new File("F:/data/");
//		if(!targetfile.exists()) {
//			System.out.println("创建"+targetfile.isDirectory());
//			System.out.println(targetfile.mkdirs());
//		}
//			try {
//				file.transferTo(new File("F:/data/"+fileName));
//				System.out.println(file.getSize());
//				model.addAttribute("msg","操作成功");
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		return "success";
//	}
	
	
	
	
	//通过这个去挑转zhuce.html
	@RequestMapping(value="/tiaozhuan", method = RequestMethod.GET)
	public String taozhuan() {
		return "zhuce";
	}
	//通过这个去跳转success.html
	@RequestMapping(value="/adduser", method = RequestMethod.POST)
	public String adduser(Model model,User user) {
		System.out.println(user);
		if(user!=null) {
			model.addAttribute("tishi","保存成功");
			
		}else {
			model.addAttribute("tishi","保存失败");
		}
		return "success";
	}
	@RequestMapping(value="/tiaosuccess", method = RequestMethod.GET)
	public String tiaosuccess() {
		return "success";
	}
	
	
	
//	@RequestMapping(value = "/save3", method = RequestMethod.POST)
//	public String post(@RequestBody User user) {
////		Map<String, Object> mp=new HashMap<>();
////		mp.put("name", user.getName());
////		mp.put("age", user.getAge());
//		System.out.println(user);
//		
//		return "success";
//	}
//
//	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//	public String delete(String name) {
//		System.out.println("您要删除的name为:" + name);
//		return "success";
//	}
//
//	@RequestMapping(value = "/put", method = RequestMethod.GET)
//	public String put(String name) {
//		System.out.println("您要删除的name为:" + name);
//		return "success";
//	}
//	
//	@RequestMapping(value = "/myname", method = RequestMethod.POST)
//	@ResponseBody
//	public String myname(Model model,HttpServletRequest req, final HttpServletResponse resp) {
//	
//		req.getParameter("name");
//		req.setAttribute("name1", "lishengshan1");
//		model.addAttribute("name", "lishengshan");
//		User user = new User();
//		user.setAge(134);
//		user.setTel(13222);
//		model.addAttribute("user", user);
//		return "success";
//	}
//
//	// map方法传值
//	@RequestMapping(value = "/map", method = RequestMethod.GET)
//	public String map(@RequestParam(required = true, defaultValue = "223") Map<String, String> map) {
//		System.out.println(map);
//
//		return "success";
	//}
}
