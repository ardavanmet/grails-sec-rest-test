import com.usermgmt.Post
import com.usermgmt.SecUser
import com.usermgmt.SecRole
import com.usermgmt.SecUserSecRole

class BootStrap {

    def init = { servletContext ->

    	def adminRole = new SecRole(authority: 'ROLE_ADMIN').save(flush: true) 
    	def userRole = new SecRole(authority: 'ROLE_USER').save(flush: true)

		def testUser = new SecUser(username: 'me', password: 'password') 
		testUser.save(flush: true)

		SecUserSecRole.create testUser, adminRole, true

		assert SecUser.count() == 1 
		assert SecRole.count() == 2 
		assert SecUserSecRole.count() == 1

		def post = new Post(post: 'Beautiful POST').save(flush: true)
		assert Post.count() == 1
    }
    def destroy = {
    }
}
