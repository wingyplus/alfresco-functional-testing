package com.wingyplus.alfresco.geb.page

import geb.Page;

/*
 * Dashboard page
 */
class DashBoardPage extends Page {

    static at = { waitFor { title == 'Alfresco » User Dashboard' } }

    static content = {
        header { $('div.title > h1 > span').text() }
        logout {
            $('button[id$=user-button]').click()
            $('a[id$=logout]').click()
        }
    }

}
