
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AdRecordingManagementAdRecordingManagementManager from "./components/listers/AdRecordingManagementAdRecordingManagementCards"
import AdRecordingManagementAdRecordingManagementDetail from "./components/listers/AdRecordingManagementAdRecordingManagementDetail"

import AdReportingReportListManagementManager from "./components/listers/AdReportingReportListManagementCards"
import AdReportingReportListManagementDetail from "./components/listers/AdReportingReportListManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/adRecordingManagements/adRecordingManagements',
                name: 'AdRecordingManagementAdRecordingManagementManager',
                component: AdRecordingManagementAdRecordingManagementManager
            },
            {
                path: '/adRecordingManagements/adRecordingManagements/:id',
                name: 'AdRecordingManagementAdRecordingManagementDetail',
                component: AdRecordingManagementAdRecordingManagementDetail
            },

            {
                path: '/adReportings/reportListManagements',
                name: 'AdReportingReportListManagementManager',
                component: AdReportingReportListManagementManager
            },
            {
                path: '/adReportings/reportListManagements/:id',
                name: 'AdReportingReportListManagementDetail',
                component: AdReportingReportListManagementDetail
            },



    ]
})
