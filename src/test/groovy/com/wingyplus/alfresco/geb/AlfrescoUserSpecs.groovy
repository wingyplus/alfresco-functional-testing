package com.wingyplus.alfresco.geb

import com.wingyplus.alfresco.geb.page.DashBoardPage;
import com.wingyplus.alfresco.geb.page.LoginPage;
import com.wingyplus.alfresco.geb.page.UsersPage;

import geb.spock.GebSpec;

class AlfrescoUserSpecs extends GebSpec {

    def setup() {
        to LoginPage
        username(Admin.USERNAME)
        password(Admin.PASSWORD)
        login
    }

    def "show list users when when following action"() {
        given:
        at DashBoardPage

        when: 'click follow action'
        alfrescoHeader.more.users

        then:
        at UsersPage
    }

}
