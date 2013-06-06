package com.wingyplus.alfresco.geb;

import com.wingyplus.alfresco.geb.page.DashBoardPage;
import com.wingyplus.alfresco.geb.page.LoginPage;

import geb.Page;
import geb.spock.GebSpec;

class AlfrescoLoginSpecs extends GebSpec {

    def "login page must have title"() {
        when:
        to LoginPage

        then:
        at LoginPage
    }

    def "login with admin must show dashboard page"() {
        when:
        to LoginPage

        and: 'enter admin username and password'
        username(Admin.USERNAME)
        password(Admin.PASSWORD)

        and: 'click'
        login

        then: 'must be show dashboard page'
        at DashBoardPage

        and: 'header show name'
        header == 'Administrator'
    }

    def "expected error message when login fail"() {
        when:
        to LoginPage

        and:
        username('a')
        password('b')

        and:
        login

        then:
        error == 'The remote server may be unavailable or your authentication details have not been recognized.'
    }

}
