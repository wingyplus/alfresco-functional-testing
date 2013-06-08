package com.wingyplus.alfresco.geb.page

import com.wingyplus.alfresco.geb.module.AlfrescoHeaderModule;

import geb.Page;

/*
 * Dashboard page
 */
class DashBoardPage extends Page {

    static at = { waitFor { title == 'Alfresco » User Dashboard' } }

    static content = {
        header { $('div.title > h1 > span').text() }
        alfrescoHeader { module AlfrescoHeaderModule }
    }

}
