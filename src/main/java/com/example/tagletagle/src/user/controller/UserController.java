package com.example.tagletagle.src.user.controller;

import org.springframework.web.bind.annotation.*;

import com.example.tagletagle.base.BaseException;
import com.example.tagletagle.base.BaseResponse;
import com.example.tagletagle.base.BaseResponseStatus;
import com.example.tagletagle.src.user.dto.UserBasicInfoDTO;
import com.example.tagletagle.src.user.service.UserService;
import com.example.tagletagle.utils.SecurityUtil;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/api/user/nickname/check")
	public boolean nicknameDupCheck(@Valid @RequestParam String nickname){
		try{
			return userService.nicknameDupCheck(nickname);


		}catch (BaseException e) {
			return false;
		}

	}

	@PatchMapping("/api/user/basic/info")
	public BaseResponse<String> saveOrUpdateUserBasicInfo(@Valid @RequestBody UserBasicInfoDTO userBasicInfoDTO){
		try{
			Long userId = SecurityUtil.getCurrentUserId()
				.orElseThrow(() -> new BaseException(BaseResponseStatus.REQUIRED_LOGIN));

			userService.saveOrUpdateUserBasicInfo(userId, userBasicInfoDTO);

			return new BaseResponse<>("기본정보가 입력되었습니다.");

		}catch (BaseException e){
			return new BaseResponse<>(e.getStatus());
		}

	}




}
