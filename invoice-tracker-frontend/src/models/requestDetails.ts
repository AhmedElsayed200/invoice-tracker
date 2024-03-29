interface Request {
  attachmentName: string
  attachmentUrl: string
  absenceAttachments: string[]
  comments: string
  endDate: string
  fullDay: boolean
  id: number
  numberOfDays: number
  requestDate: string
  requestedBy: number
  reviewedBy: number | null
  startDate: string
  status: string
  type: string
}

export interface RequestDetails {
  request: Request
  requestedBy: string
}
