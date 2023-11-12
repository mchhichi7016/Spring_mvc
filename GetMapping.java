//login页面展示
	@GetMapping("/login")
	public String getLonginPage() {
		return "admin_login.html";
	}


//login页面展示
	@GetMapping("/login")
	public String getLonginPage() {
		return "admin_login";//.html省略することができます
	}
