package com.wingyplus.alfresco.geb.page

import geb.Page;

class UsersPage extends Page {

    static at = {
        waitFor {
            title == 'Alfresco » Admin Console'
            // when go to users page it found search dialog
            $('div.title > label[for$=search-text]').text() == 'User Search'
        }
    }

    static content = {
        newUser { $('button', id: endsWith('newuser-button-button')).click() }
    }

}
