package com.wingyplus.alfresco.geb.module

import geb.Module;

class AlfrescoHeaderModule extends Module {

    static content = {
        dashboard {
            $('a[id$=app_my-dashboard-button').click()
        }

        username { module AlfrescoUserButtonModule }
    }

}