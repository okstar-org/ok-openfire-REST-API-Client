/*
 * * Copyright (c) 2022 船山信息 chuanshaninfo.com
 * OkStack is licensed under Mulan PubL v2.
 * You can use this software according to the terms and conditions of the Mulan
 * PubL v2. You may obtain a copy of Mulan PubL v2 at:
 *          http://license.coscl.org.cn/MulanPubL-2.0
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PubL v2 for more details.
 * /
 */

package org.igniterealtime.restclient.entity;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "occupant")
public class OccupantEntity {
    /**
     * <occupants>
     * <occupant>
     * <affiliation>member</affiliation>
     * <jid>oqujite@conference.meet.chuanshaninfo.com/an9ehgdzcu6m</jid>
     * <role>participant</role>
     * <userAddress>an9ehgdzcu6m@meet.chuanshaninfo.com/monocles chat[1.6.4].K8MK</userAddress>
     * </occupant>
     * </occupants>
     */
    String member;
    String jid;
    String role;
    String userAddress;

    public void setMember(String member) {
        this.member = member;
    }

    public String getMember() {
        return member;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
