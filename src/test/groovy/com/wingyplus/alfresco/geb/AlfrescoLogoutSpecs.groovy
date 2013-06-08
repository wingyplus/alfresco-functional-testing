package com.wingyplus.alfresco.geb

import com.wingyplus.alfresco.geb.module.AlfrescoHeaderModule;
import com.wingyplus.alfresco.geb.page.DashBoardPage;
import com.wingyplus.alfresco.geb.page.LoginPage;

import geb.spock.GebSpec
import groovy.lang.MetaClass;

class AlfrescoLogoutSpecs extends GebSpec {

    def "when click logout alfresco must be redirect to Login page"() {
        given:
        to LoginPage

        and:
        username(Admin.USERNAME)
        password(Admin.PASSWORD)

        and:
        login

        expect:
        at DashBoardPage

        when:
        alfrescoHeader.username.logout

        then:
        at LoginPage
    }

}
