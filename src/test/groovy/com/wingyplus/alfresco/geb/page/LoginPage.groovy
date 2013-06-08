package com.wingyplus.alfresco.geb.page

import geb.Page;

/*
 * Login page
 */
class LoginPage extends Page {

    static url = '/share/page'

    static at = { waitFor {  title == 'Alfresco » Login' } }

    static content = {
        username { username -> $('input', id: endsWith('username')).value(username) }
        password { password -> $('input', id: endsWith('password')).value(password) }
        login { $('button', id: endsWith('submit-button')).click() }
        error { $('div.error').text() }
    }

}