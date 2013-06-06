package com.wingyplus.alfresco.geb.page

import geb.Page;

/*
 * Login page
 */
class LoginPage extends Page {

    static url = '/share/page'

    static at = { waitFor {  title == 'Alfresco » Login' } }

    static content = {
        username { username -> $('input[id$=username]').value(username) }
        password { password -> $('input[id$=password]').value(password) }
        login { $('button[id$=submit-button]').click() }
        error { $('div.error').text() }
    }

}