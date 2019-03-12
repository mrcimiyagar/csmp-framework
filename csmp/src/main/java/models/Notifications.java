package models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Notifications {

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = MemberAccessUpdatedNotification.class, name = "MemberAccessUpdatedNotification"),
            @JsonSubTypes.Type(value = MessageSeenNotification.class, name = "MessageSeenNotification"),
            @JsonSubTypes.Type(value = InviteCreationNotification.class, name = "InviteCreationNotification"),
            @JsonSubTypes.Type(value = InviteAcceptanceNotification.class, name = "InviteAcceptanceNotification"),
            @JsonSubTypes.Type(value = InviteIgnoranceNotification.class, name = "InviteIgnoranceNotification"),
            @JsonSubTypes.Type(value = InviteCancellationNotification.class, name = "InviteCancellationNotification"),
            @JsonSubTypes.Type(value = ContactCreationNotification.class, name = "ContactCreationNotification"),
            @JsonSubTypes.Type(value = RoomDeletionNotification.class, name = "RoomDeletionNotification"),
            @JsonSubTypes.Type(value = TextMessageNotification.class, name = "TextMessageNotification"),
            @JsonSubTypes.Type(value = PhotoMessageNotification.class, name = "PhotoMessageNotification"),
            @JsonSubTypes.Type(value = AudioMessageNotification.class, name = "AudioMessageNotification"),
            @JsonSubTypes.Type(value = VideoMessageNotification.class, name = "VideoMessageNotification"),
            @JsonSubTypes.Type(value = ServiceMessageNotification.class, name = "ServiceMessageNotification"),
            @JsonSubTypes.Type(value = UserJointComplexNotification.class, name = "UserJointComplexNotification"),
            @JsonSubTypes.Type(value = ComplexDeletionNotification.class, name = "ComplexDeletionNotification"),
            @JsonSubTypes.Type(value = BotSentBotViewNotification.class, name = "BotSentBotViewNotification"),
            @JsonSubTypes.Type(value = BotUpdatedBotViewNotification.class, name = "BotUpdatedBotViewNotification"),
            @JsonSubTypes.Type(value = BotAnimatedBotViewNotification.class, name = "BotAnimatedBotViewNotification"),
            @JsonSubTypes.Type(value = BotRanCommandsOnBotViewNotification.class, name = "BotRanCommandsOnBotViewNotification")
    })
    public static class Notification {
        private String notificationId;
        private Entities.Session session;

        public String getNotificationId() {
            return notificationId;
        }

        public void setNotificationId(String notificationId) {
            this.notificationId = notificationId;
        }

        public Entities.Session getSession() {
            return session;
        }

        public void setSession(Entities.Session session) {
            this.session = session;
        }
    }

    public class UserRequestedBotViewNotification extends Notification{
        private long complexId;
        private long roomId;
        private long botId;
        private Entities.User user;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public long getBotId() {
            return botId;
        }

        public void setBotId(long botId) {
            this.botId = botId;
        }

        public Entities.User getUser() {
            return user;
        }

        public void setUser(Entities.User user) {
            this.user = user;
        }
    }

    public static class MemberAccessUpdatedNotification extends Notification {
        private Entities.MemberAccess memberAccess;

        public Entities.MemberAccess getMemberAccess() {
            return memberAccess;
        }

        public void setMemberAccess(Entities.MemberAccess memberAccess) {
            this.memberAccess = memberAccess;
        }
    }

    public static class BotAddedToRoomNotification extends Notification {
        private long roomId;
        private Entities.Room room;

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public Entities.Room getRoom() {
            return room;
        }

        public void setRoom(Entities.Room room) {
            this.room = room;
        }
    }

    public static class BotRemovedFromRoomNotification extends Notification {
        private long roomId;
        private Entities.Room room;

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public Entities.Room getRoom() {
            return room;
        }

        public void setRoom(Entities.Room room) {
            this.room = room;
        }
    }

    public static class MessageSeenNotification extends Notification {

        private long messageId;
        private long messageSeenCount;

        public long getMessageId() {
            return messageId;
        }

        public void setMessageId(long messageId) {
            this.messageId = messageId;
        }

        public long getMessageSeenCount() {
            return messageSeenCount;
        }

        public void setMessageSeenCount(long messageSeenCount) {
            this.messageSeenCount = messageSeenCount;
        }
    }

    public static class InviteCreationNotification extends Notification {

        private long inviteId;
        private Entities.Invite invite;

        public long getInviteId() {
            return inviteId;
        }

        public void setInviteId(long inviteId) {
            this.inviteId = inviteId;
        }

        public Entities.Invite getInvite() {
            return invite;
        }

        public void setInvite(Entities.Invite invite) {
            this.invite = invite;
        }
    }

    public static class InviteCancellationNotification extends Notification {

        private long inviteId;
        private Entities.Invite invite;

        public long getInviteId() {
            return inviteId;
        }

        public void setInviteId(long inviteId) {
            this.inviteId = inviteId;
        }

        public Entities.Invite getInvite() {
            return invite;
        }

        public void setInvite(Entities.Invite invite) {
            this.invite = invite;
        }
    }

    public static class InviteAcceptanceNotification extends Notification {

        private long inviteId;
        private Entities.Invite invite;

        public long getInviteId() {
            return inviteId;
        }

        public void setInviteId(long inviteId) {
            this.inviteId = inviteId;
        }

        public Entities.Invite getInvite() {
            return invite;
        }

        public void setInvite(Entities.Invite invite) {
            this.invite = invite;
        }
    }

    public static class InviteIgnoranceNotification extends Notification {

        private long inviteId;
        private Entities.Invite invite;

        public long getInviteId() {
            return inviteId;
        }

        public void setInviteId(long inviteId) {
            this.inviteId = inviteId;
        }

        public Entities.Invite getInvite() {
            return invite;
        }

        public void setInvite(Entities.Invite invite) {
            this.invite = invite;
        }
    }

    public static class BotSentBotViewNotification extends Notification {
        private long complexId;
        private long roomId;
        private long botId;
        private String viewData;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public long getBotId() {
            return botId;
        }

        public void setBotId(long botId) {
            this.botId = botId;
        }

        public String getViewData() {
            return viewData;
        }

        public void setViewData(String viewData) {
            this.viewData = viewData;
        }
    }

    public static class BotUpdatedBotViewNotification extends Notification {
        private long complexId;
        private long roomId;
        private long botId;
        private String updateData;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public long getBotId() {
            return botId;
        }

        public void setBotId(long botId) {
            this.botId = botId;
        }

        public String getUpdateData() {
            return updateData;
        }

        public void setUpdateData(String updateData) {
            this.updateData = updateData;
        }
    }

    public static class BotAnimatedBotViewNotification extends Notification {
        private long complexId;
        private long roomId;
        private long botId;
        private String animData;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public long getBotId() {
            return botId;
        }

        public void setBotId(long botId) {
            this.botId = botId;
        }

        public String getAnimData() {
            return animData;
        }

        public void setAnimData(String animData) {
            this.animData = animData;
        }
    }

    public static class BotRanCommandsOnBotViewNotification extends Notification {
        private long complexId;
        private long roomId;
        private long botId;
        private String commandsData;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }

        public long getBotId() {
            return botId;
        }

        public void setBotId(long botId) {
            this.botId = botId;
        }

        public String getCommandsData() {
            return commandsData;
        }

        public void setCommandsData(String commandsData) {
            this.commandsData = commandsData;
        }
    }

    public static class ContactCreationNotification extends Notification {

        private long contactId;
        private Entities.Contact contact;
        private Entities.ComplexSecret complexSecret;

        public long getContactId() {
            return contactId;
        }

        public void setContactId(long contactId) {
            this.contactId = contactId;
        }

        public Entities.Contact getContact() {
            return contact;
        }

        public void setContact(Entities.Contact contact) {
            this.contact = contact;
        }

        public Entities.ComplexSecret getComplexSecret() {
            return complexSecret;
        }

        public void setComplexSecret(Entities.ComplexSecret complexSecret) {
            this.complexSecret = complexSecret;
        }
    }

    public static class ComplexDeletionNotification extends Notification {
        private long complexId;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }
    }

    public static class RoomDeletionNotification extends Notification {
        private long complexId;
        private long roomId;

        public long getComplexId() {
            return complexId;
        }

        public void setComplexId(long complexId) {
            this.complexId = complexId;
        }

        public long getRoomId() {
            return roomId;
        }

        public void setRoomId(long roomId) {
            this.roomId = roomId;
        }
    }

    public static class TextMessageNotification extends Notification {
        private Entities.TextMessage message;

        public Entities.TextMessage getMessage() {
            return message;
        }

        public void setMessage(Entities.TextMessage message) {
            this.message = message;
        }
    }

    public static class PhotoMessageNotification extends Notification {
        private Entities.PhotoMessage message;

        public Entities.PhotoMessage getMessage() {
            return message;
        }

        public void setMessage(Entities.PhotoMessage message) {
            this.message = message;
        }
    }

    public static class AudioMessageNotification extends Notification {
        private Entities.AudioMessage message;

        public Entities.AudioMessage getMessage() {
            return message;
        }

        public void setMessage(Entities.AudioMessage message) {
            this.message = message;
        }
    }

    public static class VideoMessageNotification extends Notification {
        private Entities.VideoMessage message;

        public Entities.VideoMessage getMessage() {
            return message;
        }

        public void setMessage(Entities.VideoMessage message) {
            this.message = message;
        }
    }

    public static class ServiceMessageNotification extends Notification {
        private Entities.ServiceMessage message;

        public Entities.ServiceMessage getMessage() {
            return message;
        }

        public void setMessage(Entities.ServiceMessage message) {
            this.message = message;
        }
    }

    public static class UserJointComplexNotification extends Notification {
        private long membershipId;
        private Entities.Membership membership;

        public long getMembershipId() {
            return membershipId;
        }

        public void setMembershipId(long membershipId) {
            this.membershipId = membershipId;
        }

        public Entities.Membership getMembership() {
            return membership;
        }

        public void setMembership(Entities.Membership membership) {
            this.membership = membership;
        }
    }
}