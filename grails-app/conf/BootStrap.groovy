import com.usermgmt.SecUser
import com.usermgmt.SecRole
import com.usermgmt.SecUserSecRole

class BootStrap {

    def init = { servletContext ->

    	def adminRole = new SecRole(authority: 'ROLE_ADMIN').save(flush: true) 
    	def userRole = new SecRole(authority: 'ROLE_USER').save(flush: true)

		def testUser = new SecUser(username: 'me', password: 'password') testUser.save(flush: true)

		UserRole.create testUser, adminRole, true

		assert User.count() == 1 
		assert Role.count() == 2 
		assert UserRole.count() == 1
    }
    def destroy = {
    }
}
