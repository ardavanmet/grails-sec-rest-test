class UrlMappings {

	static mappings = {

		 //"/api/profiles"(resources:"profile") did not work

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
