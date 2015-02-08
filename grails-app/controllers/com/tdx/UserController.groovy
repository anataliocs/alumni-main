package com.tdx

import com.stormpath.sdk.account.Account
import com.stormpath.sdk.account.AccountList
import com.stormpath.sdk.directory.CustomData

class UserController {

    def stormPathService

    def index() {}

    def signup() {}

    def create() {}

    def edit() {}

    def profile() {

        AccountList accounts = stormPathService.getUser()

        Account acct = accounts.getAt(0)

        CustomData customData = acct.getCustomData()
        print "test123 " + customData.get("current-location")


        [acct: acct, customData: customData]
    }

    def save() {

        stormPathService.createUser(params.firstname, params.lastname, params.email, params.password, params.location, params.dob, params.facebookImgUrl, params.facebookLink)

        /*
        UserInfo userInfo = new UserInfo()
        User newUser = new User(userInfo: userInfo)

        newUser.username = params.email
        newUser.password = params.password

        newUser.enabled = true
        newUser.accountExpired = false
        newUser.accountLocked = false
        newUser.passwordExpired = false

        //userInfo.user = newUser.id
        userInfo.firstName = params.firstname
        userInfo.lastName = params.lastname
        userInfo.email = params.email
        userInfo.facebookLink = params.facebookLink
        userInfo.location = params.location
        userInfo.dob = Date.parse("MM/dd/yyyy", params.dob)
        userInfo.facebookImgUrl = params.facebookImgUrl

        newUser.userInfo = userInfo
        userInfo.user = newUser

        newUser.save(flush: true, failOnError: true)
        userInfo.save(flush: true, failOnError: true)
        */


        /*
        def roleUser = Role.findByAuthority('ROLE_USER')

        UserRole userRole = new UserRole()

        userRole.user = newUser
        userRole.role = roleUser

        userRole.save(flush: true)
        */

        redirect(action: "profile")
    }

}
