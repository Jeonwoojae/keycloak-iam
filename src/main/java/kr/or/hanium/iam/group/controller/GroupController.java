package kr.or.hanium.iam.group.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import io.swagger.annotations.Api;
import kr.or.hanium.iam.api.GroupApi;
import kr.or.hanium.iam.api.model.GroupDto;

@Controller
@Api(tags = "group")
public class GroupController implements GroupApi {

	@Override
	public ResponseEntity<List<GroupDto>> getGroupList() {
		// TODO Auto-generated method stub
		return null;
	}


}

