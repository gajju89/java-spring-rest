package com.zaso.agent.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.zaso.agent.model.AgentPic;
import com.zaso.agent.model.PicUrl;

public interface AgentPicService {
	
	
	
	 public void saveOrUpdate(String emailid,MultipartFile file,String filetype);
	    
	    /*public void DeleteAgentPic(String url);*/
	     
	    public List<PicUrl> list(String agentid);


}
